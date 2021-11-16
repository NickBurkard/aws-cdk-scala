package io.burkard.cdk.services.iotfleethub

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    applicationName: String,
    roleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotfleethub.CfnApplication =
    software.amazon.awscdk.services.iotfleethub.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName)
      .roleArn(roleArn)
      .tags(tags.map(_.asJava).orNull)
      .applicationDescription(applicationDescription.orNull)
      .build()
}
