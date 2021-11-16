package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTopicPolicy {

  def apply(
    internalResourceId: String,
    topics: List[String],
    policyDocument: AnyRef
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sns.CfnTopicPolicy =
    software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder
      .create(stackCtx, internalResourceId)
      .topics(topics.asJava)
      .policyDocument(policyDocument)
      .build()
}
