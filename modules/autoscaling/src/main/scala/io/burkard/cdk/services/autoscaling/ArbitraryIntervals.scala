package io.burkard.cdk.services.autoscaling

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArbitraryIntervals {

  def apply(
    intervals: Option[List[_ <: software.amazon.awscdk.services.autoscaling.common.ScalingInterval]] = None,
    absolute: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals =
    (new software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder)
      .intervals(intervals.map(_.asJava).orNull)
      .absolute(absolute.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
