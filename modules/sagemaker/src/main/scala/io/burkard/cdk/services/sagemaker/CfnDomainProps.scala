package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainProps {

  def apply(
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    defaultUserSettings: Option[software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty] = None,
    appNetworkAccessType: Option[String] = None,
    kmsKeyId: Option[String] = None,
    authMode: Option[String] = None,
    subnetIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomainProps =
    (new software.amazon.awscdk.services.sagemaker.CfnDomainProps.Builder)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .defaultUserSettings(defaultUserSettings.orNull)
      .appNetworkAccessType(appNetworkAccessType.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .authMode(authMode.orNull)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .build()
}
