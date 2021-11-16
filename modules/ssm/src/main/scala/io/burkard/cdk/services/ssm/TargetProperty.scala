package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetProperty {

  def apply(
    key: String,
    values: List[String]
  ): software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty =
    (new software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty.Builder)
      .key(key)
      .values(values.asJava)
      .build()
}
