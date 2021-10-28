package io.burkard.cdk.services.events

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRule {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    state: Option[String] = None,
    description: Option[String] = None,
    eventBusName: Option[String] = None,
    scheduleExpression: Option[String] = None,
    roleArn: Option[String] = None,
    eventPattern: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnRule =
    software.amazon.awscdk.services.events.CfnRule.Builder
      .create(stackCtx, internalResourceId)
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
