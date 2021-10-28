package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointsProperty {

  def apply(
    kafkaBootstrapServers: Option[List[String]] = None
  ): software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.Builder)
      .kafkaBootstrapServers(kafkaBootstrapServers.map(_.asJava).orNull)
      .build()
}
