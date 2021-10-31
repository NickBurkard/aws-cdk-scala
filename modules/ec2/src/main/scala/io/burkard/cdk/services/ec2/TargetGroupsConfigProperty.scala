package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetGroupsConfigProperty {

  def apply(
    targetGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty.Builder)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .build()
}
