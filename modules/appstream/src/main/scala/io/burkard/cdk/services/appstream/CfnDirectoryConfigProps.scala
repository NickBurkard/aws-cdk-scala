package io.burkard.cdk.services.appstream

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDirectoryConfigProps {

  def apply(
    organizationalUnitDistinguishedNames: Option[List[String]] = None,
    serviceAccountCredentials: Option[software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty] = None,
    directoryName: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps =
    (new software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder)
      .organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames.map(_.asJava).orNull)
      .serviceAccountCredentials(serviceAccountCredentials.orNull)
      .directoryName(directoryName.orNull)
      .build()
}