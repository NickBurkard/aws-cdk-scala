package io.burkard.cdk.services.lakeformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataLakeSettingsProps {

  def apply(
    admins: Option[List[_]] = None,
    trustedResourceOwners: Option[List[String]] = None
  ): software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps =
    (new software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps.Builder)
      .admins(admins.map(_.asJava).orNull)
      .trustedResourceOwners(trustedResourceOwners.map(_.asJava).orNull)
      .build()
}
