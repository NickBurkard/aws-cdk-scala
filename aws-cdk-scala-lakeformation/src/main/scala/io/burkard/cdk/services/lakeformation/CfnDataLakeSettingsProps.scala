package io.burkard.cdk.services.lakeformation

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
