package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
