package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDirectoryConfigProps {

  def apply(
    organizationalUnitDistinguishedNames: List[String],
    serviceAccountCredentials: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty,
    directoryName: String
  ): software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps =
    (new software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder)
      .organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames.asJava)
      .serviceAccountCredentials(serviceAccountCredentials)
      .directoryName(directoryName)
      .build()
}
