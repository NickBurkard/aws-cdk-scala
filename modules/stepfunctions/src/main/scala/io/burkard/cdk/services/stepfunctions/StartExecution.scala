package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StartExecution {

  def apply(
    stateMachine: software.amazon.awscdk.services.stepfunctions.IStateMachine,
    name: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    input: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.StartExecution =
    software.amazon.awscdk.services.stepfunctions.tasks.StartExecution.Builder
      .create(stateMachine)
      .name(name.orNull)
      .integrationPattern(integrationPattern.orNull)
      .input(input.map(_.asJava).orNull)
      .build()
}
