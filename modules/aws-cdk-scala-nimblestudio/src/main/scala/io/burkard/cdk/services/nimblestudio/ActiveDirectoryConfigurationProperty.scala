package io.burkard.cdk.services.nimblestudio

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActiveDirectoryConfigurationProperty {

  def apply(
    organizationalUnitDistinguishedName: Option[String] = None,
    directoryId: Option[String] = None,
    computerAttributes: Option[List[_]] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty.Builder)
      .organizationalUnitDistinguishedName(organizationalUnitDistinguishedName.orNull)
      .directoryId(directoryId.orNull)
      .computerAttributes(computerAttributes.map(_.asJava).orNull)
      .build()
}
