package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainProps {

  def apply(
    vpcId: String,
    domainName: String,
    defaultUserSettings: software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty,
    authMode: String,
    subnetIds: List[String],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    appNetworkAccessType: Option[String] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomainProps =
    (new software.amazon.awscdk.services.sagemaker.CfnDomainProps.Builder)
      .vpcId(vpcId)
      .domainName(domainName)
      .defaultUserSettings(defaultUserSettings)
      .authMode(authMode)
      .subnetIds(subnetIds.asJava)
      .tags(tags.map(_.asJava).orNull)
      .appNetworkAccessType(appNetworkAccessType.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
