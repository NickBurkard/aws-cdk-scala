package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
