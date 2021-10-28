package io.burkard.cdk.services.batch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
