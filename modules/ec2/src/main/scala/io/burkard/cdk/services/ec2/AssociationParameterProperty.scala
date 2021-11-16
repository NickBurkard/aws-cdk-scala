package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssociationParameterProperty {

  def apply(
    key: String,
    value: List[String]
  ): software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty.Builder)
      .key(key)
      .value(value.asJava)
      .build()
}
