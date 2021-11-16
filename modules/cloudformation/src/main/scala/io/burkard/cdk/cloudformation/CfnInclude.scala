package io.burkard.cdk.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInclude {

  def apply(
    internalResourceId: String,
    templateFile: String,
    preserveLogicalIds: Option[Boolean] = None,
    loadNestedStacks: Option[Map[String, _ <: software.amazon.awscdk.cloudformation.include.CfnIncludeProps]] = None,
    parameters: Option[Map[String, _]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.cloudformation.include.CfnInclude =
    software.amazon.awscdk.cloudformation.include.CfnInclude.Builder
      .create(stackCtx, internalResourceId)
      .templateFile(templateFile)
      .preserveLogicalIds(preserveLogicalIds.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadNestedStacks(loadNestedStacks.map(_.asJava).orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
