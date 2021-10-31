package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
