package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ManualApprovalStepProps {

  def apply(
    comment: Option[String] = None
  ): software.amazon.awscdk.pipelines.ManualApprovalStepProps =
    (new software.amazon.awscdk.pipelines.ManualApprovalStepProps.Builder)
      .comment(comment.orNull)
      .build()
}
