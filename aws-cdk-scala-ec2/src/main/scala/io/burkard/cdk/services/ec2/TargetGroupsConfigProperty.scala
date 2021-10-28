package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetGroupsConfigProperty {

  def apply(
    targetGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty.Builder)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .build()
}
