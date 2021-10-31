package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
    policies1: Option[software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty] = None,
    policies2: Option[List[_]] = None,
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
      .policies(policies1.orNull)
      .policies(policies2.map(_.asJava).orNull)
      .logging(logging.orNull)
      .definitionSubstitutions(definitionSubstitutions.map(_.asJava).orNull)
      .permissionsBoundaries(permissionsBoundaries.orNull)
      .`type`(`type`.orNull)
      .tracing(tracing.orNull)
      .build()
}
