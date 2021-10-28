package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsOrganizationsSourceProperty {

  def apply(
    organizationSourceType: Option[String] = None,
    organizationalUnits: Option[List[String]] = None
  ): software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty =
    (new software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty.Builder)
      .organizationSourceType(organizationSourceType.orNull)
      .organizationalUnits(organizationalUnits.map(_.asJava).orNull)
      .build()
}
