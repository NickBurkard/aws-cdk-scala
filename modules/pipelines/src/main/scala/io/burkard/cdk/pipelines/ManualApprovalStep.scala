package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManualApprovalStep {

  def apply(
    id: String,
    comment: Option[String] = None
  ): software.amazon.awscdk.pipelines.ManualApprovalStep =
    software.amazon.awscdk.pipelines.ManualApprovalStep.Builder
      .create(id)
      .comment(comment.orNull)
      .build()
}
