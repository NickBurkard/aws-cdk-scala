package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInput {

  def apply(
    internalResourceId: String,
    inputDefinition: Option[software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty] = None,
    inputName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    inputDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotevents.CfnInput =
    software.amazon.awscdk.services.iotevents.CfnInput.Builder
      .create(stackCtx, internalResourceId)
      .inputDefinition(inputDefinition.orNull)
      .inputName(inputName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .inputDescription(inputDescription.orNull)
      .build()
}
