package io.burkard.cdk.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIncludeProps {

  def apply(
    templateFile: String,
    preserveLogicalIds: Option[Boolean] = None,
    loadNestedStacks: Option[Map[String, _ <: software.amazon.awscdk.cloudformation.include.CfnIncludeProps]] = None,
    parameters: Option[Map[String, _]] = None
  ): software.amazon.awscdk.cloudformation.include.CfnIncludeProps =
    (new software.amazon.awscdk.cloudformation.include.CfnIncludeProps.Builder)
      .templateFile(templateFile)
      .preserveLogicalIds(preserveLogicalIds.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadNestedStacks(loadNestedStacks.map(_.asJava).orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
