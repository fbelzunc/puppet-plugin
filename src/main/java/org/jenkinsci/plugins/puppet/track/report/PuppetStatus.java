package org.jenkinsci.plugins.puppet.track.report;

import java.util.ArrayList;
import java.util.List;

/**
 * SnakeYAML databinding class for parsing puppet report.
 *
 * @author Kohsuke Kawaguchi
 */
public class PuppetStatus {
    public String resource;
    public boolean changed;
    public String resource_type;
    public String title;
    public boolean skipped;
    public boolean failed;

    public List<PuppetEvent> events = new ArrayList<PuppetEvent>();

    @Override
    public String toString() {
        return "PuppetStatus{" +
                "resource_type='" + resource_type + '\'' +
                ", title='" + title + '\'' +
                ", resource='" + resource + '\'' +
                ", changed=" + changed +
                ", failed=" + failed +
                ", skipped=" + skipped +
                '}';
    }
}
