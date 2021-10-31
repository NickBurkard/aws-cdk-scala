package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RetryStrategyProperty {

  def apply(
    attempts: Option[Number] = None,
    evaluateOnExit: Option[List[_]] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder)
      .attempts(attempts.orNull)
      .evaluateOnExit(evaluateOnExit.map(_.asJava).orNull)
      .build()
}
