package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApp {

  def apply(
    internalResourceId: String,
    appType: String,
    userProfileName: String,
    domainId: String,
    appName: String,
    resourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnApp =
    software.amazon.awscdk.services.sagemaker.CfnApp.Builder
      .create(stackCtx, internalResourceId)
      .appType(appType)
      .userProfileName(userProfileName)
      .domainId(domainId)
      .appName(appName)
      .resourceSpec(resourceSpec.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
