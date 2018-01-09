package com.mapbox.services.android.navigation.v5.navigation;

import android.support.annotation.StringDef;

import com.mapbox.services.android.navigation.v5.offroute.OffRouteListener;

/**
 * Navigation constants
 *
 * @since 0.1.0
 */
public final class NavigationConstants {

  private NavigationConstants() {
    // Empty private constructor to prevent users creating an instance of this class.
  }

  /**
   * If default voice instructions are enabled, this identifier will be used to differentiate them
   * from custom milestones in the
   * {@link com.mapbox.services.android.navigation.v5.milestone.MilestoneEventListener}.
   *
   * @since 0.7.0
   */
  public static final int VOICE_INSTRUCTION_MILESTONE_ID = 1;


  /**
   * String channel used to post the navigation notification (custom or default).
   * <p>
   * If > Android O, a notification channel needs to be created to properly post the notification.
   *
   * @since 0.8.0
   */
  public static final String NAVIGATION_NOTIFICATION_CHANNEL = "NAVIGATION_NOTIFICATION_CHANNEL";

  /**
   * Random integer value used for identifying the navigation notification.
   *
   * @since 0.5.0
   */
  public static final int NAVIGATION_NOTIFICATION_ID = 5678;

  /**
   * Threshold user must be within to count as completing a step. One of two heuristics used to know
   * when a user completes a step, see {@link #MANEUVER_ZONE_RADIUS}. The users heading and the
   * finalHeading are compared. If this number is within this defined constant, the user has
   * completed the step.
   *
   * @since 0.1.0
   */
  static final int MAXIMUM_ALLOWED_DEGREE_OFFSET_FOR_TURN_COMPLETION = 30;

  /**
   * Radius in meters the user must enter to count as completing a step. One of two heuristics used
   * to know when a user completes a step, see
   * {@link #MAXIMUM_ALLOWED_DEGREE_OFFSET_FOR_TURN_COMPLETION}.
   *
   * @since 0.1.0
   */
  public static final int MANEUVER_ZONE_RADIUS = 40;

  /**
   * Maximum number of meters the user can travel away from step before the
   * {@link OffRouteListener}'s called.
   *
   * @since 0.2.0
   */
  static final double MAXIMUM_DISTANCE_BEFORE_OFF_ROUTE = 20;

  /**
   * Seconds used before a reroute occurs.
   *
   * @since 0.2.0
   */
  static final int SECONDS_BEFORE_REROUTE = 3;

  /**
   * Accepted deviation excluding horizontal accuracy before the user is considered to be off route.
   *
   * @since 0.1.0
   */
  static final double USER_LOCATION_SNAPPING_DISTANCE = 10;

  /**
   * When calculating whether or not the user is on the route, we look where the user will be given
   * their speed and this variable.
   *
   * @since 0.2.0
   */
  static final double DEAD_RECKONING_TIME_INTERVAL = 1.0;

  /**
   * Maximum angle the user puck will be rotated when snapping the user's course to the route line.
   *
   * @since 0.3.0
   */
  static final int MAX_MANIPULATED_COURSE_ANGLE = 25;

  /**
   * Meter radius which the user must be inside for an arrival milestone to be triggered and
   * navigation to end.
   */
  public static final double METERS_REMAINING_TILL_ARRIVAL = 40;

  public static final double MINIMUM_BACKUP_DISTANCE_FOR_OFF_ROUTE = 50;

  public static final double MINIMUM_DISTANCE_BEFORE_REROUTING = 50;

  /**
   * Text to be shown in AlertView during off-route scenario.
   */
  public static final String REPORT_PROBLEM = "Report Problem";

  /**
   * Duration in which the AlertView is shown with the "Report Problem" text.
   */
  public static final long ALERT_VIEW_PROBLEM_DURATION = 10000;

  /**
   * Duration in which the feedback BottomSheet is shown.
   */
  public static final long FEEDBACK_BOTTOM_SHEET_DURATION = 10000;

  /**
   * Shown in AlertView after a particular feedback item has been selected.
   */
  public static final String FEEDBACK_SUBMITTED = "Feedback Submitted";

  /**
   * If a set of light / dark themes been set in {@link android.content.SharedPreferences}
   */
  public static final String NAVIGATION_VIEW_PREFERENCE_SET_THEME = "navigation_view_theme_preference";

  /**
   * Key for the set light theme in preferences
   */
  public static final String NAVIGATION_VIEW_LIGHT_THEME = "navigation_view_light_theme";

  /**
   * Key for the set dark theme in preferences
   */
  public static final String NAVIGATION_VIEW_DARK_THEME = "navigation_view_dark_theme";

  /**
   * In seconds, how quickly {@link com.mapbox.services.android.navigation.v5.route.FasterRouteDetector}
   * will tell {@link NavigationEngine} to check
   * for a faster {@link com.mapbox.api.directions.v5.models.DirectionsRoute}.
   *
   * @since 0.9.0
   */
  public static final int NAVIGATION_CHECK_FASTER_ROUTE_INTERVAL = 120;

  // Bundle variable keys
  public static final String NAVIGATION_VIEW_ORIGIN_LAT_KEY = "origin_lat";
  public static final String NAVIGATION_VIEW_ORIGIN_LNG_KEY = "origin_long";
  public static final String NAVIGATION_VIEW_ORIGIN = "origin";
  public static final String NAVIGATION_VIEW_DESTINATION_LAT_KEY = "destination_lat";
  public static final String NAVIGATION_VIEW_DESTINATION_LNG_KEY = "destination_long";
  public static final String NAVIGATION_VIEW_DESTINATION = "destination";
  public static final String NAVIGATION_VIEW_ROUTE_KEY = "route_json";
  public static final String NAVIGATION_VIEW_AWS_POOL_ID = "navigation_view_aws_pool_id";
  public static final String NAVIGATION_VIEW_UNIT_TYPE = "navigation_view_unit_type";
  public static final String NAVIGATION_VIEW_REROUTING = "Rerouting";
  public static final String DECIMAL_FORMAT = "#.#";

  // Step Maneuver Types
  public static final String STEP_MANEUVER_TYPE_TURN = "turn";
  public static final String STEP_MANEUVER_TYPE_NEW_NAME = "new name";
  public static final String STEP_MANEUVER_TYPE_DEPART = "depart";
  public static final String STEP_MANEUVER_TYPE_ARRIVE = "arrive";
  public static final String STEP_MANEUVER_TYPE_MERGE = "merge";
  public static final String STEP_MANEUVER_TYPE_ON_RAMP = "on ramp";
  public static final String STEP_MANEUVER_TYPE_OFF_RAMP = "off ramp";
  public static final String STEP_MANEUVER_TYPE_FORK = "fork";
  public static final String STEP_MANEUVER_TYPE_END_OF_ROAD = "end of road";
  public static final String STEP_MANEUVER_TYPE_CONTINUE = "continue";
  public static final String STEP_MANEUVER_TYPE_ROUNDABOUT = "roundabout";
  public static final String STEP_MANEUVER_TYPE_ROTARY = "rotary";
  public static final String STEP_MANEUVER_TYPE_ROUNDABOUT_TURN = "roundabout turn";
  public static final String STEP_MANEUVER_TYPE_NOTIFICATION = "notification";

  @StringDef( {
    STEP_MANEUVER_TYPE_TURN,
    STEP_MANEUVER_TYPE_NEW_NAME,
    STEP_MANEUVER_TYPE_DEPART,
    STEP_MANEUVER_TYPE_ARRIVE,
    STEP_MANEUVER_TYPE_MERGE,
    STEP_MANEUVER_TYPE_ON_RAMP,
    STEP_MANEUVER_TYPE_OFF_RAMP,
    STEP_MANEUVER_TYPE_FORK,
    STEP_MANEUVER_TYPE_END_OF_ROAD,
    STEP_MANEUVER_TYPE_CONTINUE,
    STEP_MANEUVER_TYPE_ROUNDABOUT,
    STEP_MANEUVER_TYPE_ROTARY,
    STEP_MANEUVER_TYPE_ROUNDABOUT_TURN,
    STEP_MANEUVER_TYPE_NOTIFICATION
  })
  public @interface ManeuverType {
  }

  // Step Maneuver Modifiers
  public static final String STEP_MANEUVER_MODIFIER_UTURN = "uturn";
  public static final String STEP_MANEUVER_MODIFIER_SHARP_RIGHT = "sharp right";
  public static final String STEP_MANEUVER_MODIFIER_RIGHT = "right";
  public static final String STEP_MANEUVER_MODIFIER_SLIGHT_RIGHT = "slight right";
  public static final String STEP_MANEUVER_MODIFIER_STRAIGHT = "straight";
  public static final String STEP_MANEUVER_MODIFIER_SLIGHT_LEFT = "slight left";
  public static final String STEP_MANEUVER_MODIFIER_LEFT = "left";
  public static final String STEP_MANEUVER_MODIFIER_SHARP_LEFT = "sharp left";

  @StringDef( {
    STEP_MANEUVER_MODIFIER_UTURN,
    STEP_MANEUVER_MODIFIER_SHARP_RIGHT,
    STEP_MANEUVER_MODIFIER_RIGHT,
    STEP_MANEUVER_MODIFIER_SLIGHT_RIGHT,
    STEP_MANEUVER_MODIFIER_STRAIGHT,
    STEP_MANEUVER_MODIFIER_SLIGHT_LEFT,
    STEP_MANEUVER_MODIFIER_LEFT,
    STEP_MANEUVER_MODIFIER_SHARP_LEFT
  })
  public @interface ManeuverModifier {
  }

  // Turn Lane Indication
  public static final String TURN_LANE_INDICATION_LEFT = "left";
  public static final String TURN_LANE_INDICATION_SLIGHT_LEFT = "slight left";
  public static final String TURN_LANE_INDICATION_STRAIGHT = "straight";
  public static final String TURN_LANE_INDICATION_RIGHT = "right";
  public static final String TURN_LANE_INDICATION_SLIGHT_RIGHT = "slight right";
  public static final String TURN_LANE_INDICATION_UTURN = "uturn";
  public static final String NAVIGATION_VIEW_SIMULATE_ROUTE = "navigation_view_simulate_route";
}