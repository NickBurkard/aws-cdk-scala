package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleProps {

  def apply(
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    state: Option[String] = None,
    description: Option[String] = None,
    eventBusName: Option[String] = None,
    scheduleExpression: Option[String] = None,
    roleArn: Option[String] = None,
    eventPattern: Option[AnyRef] = None
  ): software.amazon.awscdk.services.events.CfnRuleProps =
    (new software.amazon.awscdk.services.events.CfnRuleProps.Builder)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .state(state.orNull)
      .description(description.orNull)
      .eventBusName(eventBusName.orNull)
      .scheduleExpression(scheduleExpression.orNull)
      .roleArn(roleArn.orNull)
      .eventPattern(eventPattern.orNull)
      .build()
}
