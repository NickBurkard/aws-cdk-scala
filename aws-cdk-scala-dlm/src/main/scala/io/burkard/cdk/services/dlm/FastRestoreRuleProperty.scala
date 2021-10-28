package io.burkard.cdk.services.dlm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FastRestoreRuleProperty {

  def apply(
    count: Option[Number] = None,
    intervalUnit: Option[String] = None,
    interval: Option[Number] = None,
    availabilityZones: Option[List[String]] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty.Builder)
      .count(count.orNull)
      .intervalUnit(intervalUnit.orNull)
      .interval(interval.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .build()
}
