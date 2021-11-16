package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDirectoryConfig {

  def apply(
    internalResourceId: String,
    organizationalUnitDistinguishedNames: List[String],
    serviceAccountCredentials: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty,
    directoryName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnDirectoryConfig =
    software.amazon.awscdk.services.appstream.CfnDirectoryConfig.Builder
      .create(stackCtx, internalResourceId)
      .organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames.asJava)
      .serviceAccountCredentials(serviceAccountCredentials)
      .directoryName(directoryName)
      .build()
}
