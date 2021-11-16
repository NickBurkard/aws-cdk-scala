package io.burkard.cdk.services.iotfleethub

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    applicationName: String,
    roleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationDescription: Option[String] = None
  ): software.amazon.awscdk.services.iotfleethub.CfnApplicationProps =
    (new software.amazon.awscdk.services.iotfleethub.CfnApplicationProps.Builder)
      .applicationName(applicationName)
      .roleArn(roleArn)
      .tags(tags.map(_.asJava).orNull)
      .applicationDescription(applicationDescription.orNull)
      .build()
}
