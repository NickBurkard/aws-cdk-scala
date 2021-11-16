package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArbitraryIntervals {

  def apply(
    intervals: List[_ <: software.amazon.awscdk.services.autoscaling.common.ScalingInterval],
    absolute: Boolean
  ): software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals =
    (new software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder)
      .intervals(intervals.asJava)
      .absolute(absolute)
      .build()
}
