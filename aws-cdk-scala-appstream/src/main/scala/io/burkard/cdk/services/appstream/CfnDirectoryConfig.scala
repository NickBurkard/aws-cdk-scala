package io.burkard.cdk.services.appstream

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDirectoryConfig {

  def apply(
    internalResourceId: String,
    organizationalUnitDistinguishedNames: Option[List[String]] = None,
    serviceAccountCredentials: Option[software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty] = None,
    directoryName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnDirectoryConfig =
    software.amazon.awscdk.services.appstream.CfnDirectoryConfig.Builder
      .create(stackCtx, internalResourceId)
      .organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames.map(_.asJava).orNull)
      .serviceAccountCredentials(serviceAccountCredentials.orNull)
      .directoryName(directoryName.orNull)
      .build()
}
