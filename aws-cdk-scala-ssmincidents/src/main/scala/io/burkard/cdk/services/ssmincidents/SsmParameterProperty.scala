package io.burkard.cdk.services.ssmincidents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SsmParameterProperty {

  def apply(
    key: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty.Builder)
      .key(key.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
