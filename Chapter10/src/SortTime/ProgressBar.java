package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 21..
 * Ascii progress meter. On completion this will reset itself,
 * so it can be reused
 * <br /><br />
 * 100% ################################################## |
 */
public class ProgressBar {
    private StringBuilder progress;

    /**
     * initialize progress bar properties.
     */
    public ProgressBar() {
        init();
    }

    /**
     * called whenever the progress bar needs to be updated.
     * that is whenever progress was made.
     *
     * @param done an int representing the work done so far
     * @param total an int representing the total work
     */
    public void update(int done, int total) {
        char[] workChars = {'|', '/', '-', '\\'};
        String format = "\r%3d%% %s %c";

        int percent = (++done * 100) / total;
        int extraChars = (percent / 2) - this.progress.length();

        while (extraChars-- > 0) {
            progress.append('#');
        }

        System.out.printf(format, percent, progress,
                workChars[done % workChars.length]);

        if (done == total) {
            System.out.flush();
            System.out.println();
            init();
        }
    }

    private void init() {
        this.progress = new StringBuilder(60);
    }
}
