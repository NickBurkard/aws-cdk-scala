package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomain {

  def apply(
    internalResourceId: String,
    vpcId: String,
    domainName: String,
    defaultUserSettings: software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty,
    authMode: String,
    subnetIds: List[String],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    appNetworkAccessType: Option[String] = None,
    kmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnDomain =
    software.amazon.awscdk.services.sagemaker.CfnDomain.Builder
      .create(stackCtx, internalResourceId)
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
