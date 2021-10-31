package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointsProperty {

  def apply(
    kafkaBootstrapServers: Option[List[String]] = None
  ): software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.Builder)
      .kafkaBootstrapServers(kafkaBootstrapServers.map(_.asJava).orNull)
      .build()
}
