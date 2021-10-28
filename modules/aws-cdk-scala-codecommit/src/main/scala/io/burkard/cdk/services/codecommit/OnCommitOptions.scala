package io.burkard.cdk.services.codecommit

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnCommitOptions {

  def apply(
    ruleName: Option[String] = None,
    description: Option[String] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    target: Option[software.amazon.awscdk.services.events.IRuleTarget] = None,
    branches: Option[List[String]] = None
  ): software.amazon.awscdk.services.codecommit.OnCommitOptions =
    (new software.amazon.awscdk.services.codecommit.OnCommitOptions.Builder)
      .ruleName(ruleName.orNull)
      .description(description.orNull)
      .eventPattern(eventPattern.orNull)
      .target(target.orNull)
      .branches(branches.map(_.asJava).orNull)
      .build()
}
