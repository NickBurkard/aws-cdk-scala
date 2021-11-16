package io.burkard.cdk.services.ssmincidents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SsmParameterProperty {

  def apply(
    key: String,
    values: List[String]
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty.Builder)
      .key(key)
      .values(values.asJava)
      .build()
}
