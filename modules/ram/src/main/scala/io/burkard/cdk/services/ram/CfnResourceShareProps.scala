package io.burkard.cdk.services.ram

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceShareProps {

  def apply(
    name: Option[String] = None,
    principals: Option[List[String]] = None,
    resourceArns: Option[List[String]] = None,
    permissionArns: Option[List[String]] = None,
    allowExternalPrincipals: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ram.CfnResourceShareProps =
    (new software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder)
      .name(name.orNull)
      .principals(principals.map(_.asJava).orNull)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .permissionArns(permissionArns.map(_.asJava).orNull)
      .allowExternalPrincipals(allowExternalPrincipals.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .build()
}
