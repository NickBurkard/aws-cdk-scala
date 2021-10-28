package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssociationParameterProperty {

  def apply(
    key: Option[String] = None,
    value: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty.Builder)
      .key(key.orNull)
      .value(value.map(_.asJava).orNull)
      .build()
}
