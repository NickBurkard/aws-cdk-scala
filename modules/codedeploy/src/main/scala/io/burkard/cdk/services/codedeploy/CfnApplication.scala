package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    computePlatform: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.CfnApplication =
    software.amazon.awscdk.services.codedeploy.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .computePlatform(computePlatform.orNull)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .build()
}
