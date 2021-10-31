package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PhysicalConnectionRequirementsProperty {

  def apply(
    availabilityZone: Option[String] = None,
    subnetId: Option[String] = None,
    securityGroupIdList: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty =
    (new software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .subnetId(subnetId.orNull)
      .securityGroupIdList(securityGroupIdList.map(_.asJava).orNull)
      .build()
}
