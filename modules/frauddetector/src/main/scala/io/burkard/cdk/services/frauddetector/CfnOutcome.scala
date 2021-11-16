package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOutcome {

  def apply(
    internalResourceId: String,
    name: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.frauddetector.CfnOutcome =
    software.amazon.awscdk.services.frauddetector.CfnOutcome.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
