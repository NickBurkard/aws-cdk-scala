package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PolicyDocument {

  def apply(
    assignSids: Option[Boolean] = None,
    statements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None
  ): software.amazon.awscdk.services.iam.PolicyDocument =
    software.amazon.awscdk.services.iam.PolicyDocument.Builder
      .create()
      .assignSids(assignSids.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .statements(statements.map(_.asJava).orNull)
      .build()
}
