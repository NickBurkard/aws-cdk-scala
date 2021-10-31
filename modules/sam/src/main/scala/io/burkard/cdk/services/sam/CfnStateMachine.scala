package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStateMachine {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    role: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    definition: Option[AnyRef] = None,
    definitionUri0: Option[software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty] = None,
    definitionUri1: Option[String] = None,
    events: Option[Map[String, _]] = None,
    policies0: Option[String] = None,
    policies1: Option[List[_]] = None,
    policies2: Option[software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty] = None,
    logging: Option[software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty] = None,
    definitionSubstitutions: Option[Map[String, String]] = None,
    permissionsBoundaries: Option[String] = None,
    `type`: Option[String] = None,
    tracing: Option[software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sam.CfnStateMachine =
    software.amazon.awscdk.services.sam.CfnStateMachine.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .role(role.orNull)
      .tags(tags.map(_.asJava).orNull)
      .definition(definition.orNull)
      .definitionUri(definitionUri0.orNull)
      .definitionUri(definitionUri1.orNull)
      .events(events.map(_.asJava).orNull)
      .policies(policies0.orNull)
      .policies(policies1.map(_.asJava).orNull)
      .policies(policies2.orNull)
      .logging(logging.orNull)
      .definitionSubstitutions(definitionSubstitutions.map(_.asJava).orNull)
      .permissionsBoundaries(permissionsBoundaries.orNull)
      .`type`(`type`.orNull)
      .tracing(tracing.orNull)
      .build()
}
