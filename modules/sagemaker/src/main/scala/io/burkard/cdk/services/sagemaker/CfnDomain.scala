package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomain {

  def apply(
    internalResourceId: String,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    defaultUserSettings: Option[software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty] = None,
    appNetworkAccessType: Option[String] = None,
    kmsKeyId: Option[String] = None,
    authMode: Option[String] = None,
    subnetIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnDomain =
    software.amazon.awscdk.services.sagemaker.CfnDomain.Builder
      .create(stackCtx, internalResourceId)
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
