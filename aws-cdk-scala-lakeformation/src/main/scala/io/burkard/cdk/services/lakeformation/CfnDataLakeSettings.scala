package io.burkard.cdk.services.lakeformation

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDataLakeSettings {

  def apply(
    internalResourceId: String,
    admins: Option[List[_]] = None,
    trustedResourceOwners: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings =
    software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.Builder
      .create(stackCtx, internalResourceId)
      .admins(admins.map(_.asJava).orNull)
      .trustedResourceOwners(trustedResourceOwners.map(_.asJava).orNull)
      .build()
}
