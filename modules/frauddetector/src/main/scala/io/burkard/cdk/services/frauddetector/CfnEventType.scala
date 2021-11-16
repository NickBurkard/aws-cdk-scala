package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventType {

  def apply(
    internalResourceId: String,
    eventVariables: List[_],
    name: String,
    labels: List[_],
    entityTypes: List[_],
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.frauddetector.CfnEventType =
    software.amazon.awscdk.services.frauddetector.CfnEventType.Builder
      .create(stackCtx, internalResourceId)
      .eventVariables(eventVariables.asJava)
      .name(name)
      .labels(labels.asJava)
      .entityTypes(entityTypes.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
