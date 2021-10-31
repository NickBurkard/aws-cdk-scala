package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTopicPolicy {

  def apply(
    internalResourceId: String,
    topics: Option[List[String]] = None,
    policyDocument: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sns.CfnTopicPolicy =
    software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder
      .create(stackCtx, internalResourceId)
      .topics(topics.map(_.asJava).orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
